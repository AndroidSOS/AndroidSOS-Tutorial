public class ResultActivity extends AppCompatActivity {
 
    private TextView t_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
 
        t_result = (TextView)findViewById(R.id.t_result);
 
        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("resultado");
        t_result.setText("O resultado é: "+ str);
 
    }
}
