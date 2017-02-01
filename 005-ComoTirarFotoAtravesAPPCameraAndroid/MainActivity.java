public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private File filePhoto;
    private static final int REQUESTCODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView_Photo);
        button = (Button) findViewById(R.id.btn_Photo);

        // Definição do caminho e nome do ficheiro
        filePhoto = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "minhaFoto.jpg");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ComecarCamera();
            }
        });
    }

    private void ComecarCamera(){
      // Iniciar Intent para executar a aplicacao Camera do sistema Android
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(filePhoto));
        startActivityForResult(intent, REQUESTCODE);

        //Guardar a imagem na Galeria
        Intent intentGuardar = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        intentGuardar.setData(Uri.fromFile(filePhoto));
        this.sendBroadcast(intentGuardar);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        Bitmap imagem = null;
        if(requestCode == REQUESTCODE && resultCode == RESULT_OK){
            try {
                imagem = MediaStore.Images.Media.getBitmap(this.getContentResolver(), Uri.fromFile(filePhoto));
                imageView.setImageBitmap(imagem);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}