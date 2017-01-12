public class MainActivity extends AppCompatActivity { 
	
  // Declaração 
	private static final String MY_SPREFS_NAME = "SPrefFile"; 
	private TextView insertTView; 
	private TextView readTView; 
	private Button insert_btn; 
	private Button read_btn; 
	
	@Override 
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main); 
		
		// Inicialiazação 
		insertTView = (TextView)findViewById(R.id.insertTView); 
		readTView = (TextView)findViewById(R.id.readTextView); 
		insert_btn = (Button) findViewById(R.id.insert_btn); 
		read_btn = (Button) findViewById(R.id.read_btn); 
		
		// Listeners 
		insertTView.setOnClickListener(new View.OnClickListener() { 
			@Override public void onClick(View v) { 
				insertTView.setText(""); 
			} 
		}); 
		
		insert_btn.setOnClickListener(new View.OnClickListener() { 
			@Override public void onClick(View v) { 
				escrever(insertTView); 
			} 
		}); 
		
		read_btn.setOnClickListener(new View.OnClickListener() { 
			@Override public void onClick(View v) { 
				ler(readTView); 
			} 
		}); } 
		
		// LER 
		private void ler(TextView tv) { 
			SharedPreferences prefs = getSharedPreferences(MY_SPREFS_NAME, MODE_PRIVATE); 
			String restoredText = prefs.getString("example", null); 
			if(restoredText!=null) { 
				tv.setText(restoredText); 
			} 
		} 
		
		// ESCREVER 
		private void escrever(TextView tv) { 
			if(tv.getText()!="") { 
				SharedPreferences.Editor editor = getSharedPreferences(MY_SPREFS_NAME, MODE_PRIVATE).edit(); 
				editor.putString("example", tv.getText().toString()); editor.commit(); 
			} 
		}

}
