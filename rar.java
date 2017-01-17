        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.codebases, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);

        Spinner dropdown1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.make_a_choice, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown1.setAdapter(adapter1);

        Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
        //String[] items2 = new String[]{"Guides", "Game Modes", "Objects"};
        //ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
        R.array.make_a_choice, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown2.setAdapter(adapter2);

        final TextView myjavatextview = (TextView)findViewById(R.id.TEXT_STATUS_ID);
        //I used this so I can access the main textView in my app

        // This shit down here attaches a listener to this specific spinner so when it's selected
        // the main textView is changed. Which is the whole point.
        //TODO Fill in the basic Job description pages
        //TODO Figure out how to have the 2nd Spinner change the 3rd Spinner.
        //TODO Figure out how to match corresponding Spinnenrs with the right descriptions.
        //TODO Fuck it just make a huge switch selector function. Get rid of that outdated to String shit.
        //TODO when you change the first two spinners they change the lower spinners, but not the TextView.
        // Such that if I pick Paradise, Guides, then Science, it gives me the correct description on textView. Fuck this is hard.

        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //myjavatextview.setText(parent.getItemAtPosition(position).toString());
                //selector[0] = position;
                //window = String.valueOf(selector[0]) + String.valueOf(selector[1]) + String.valueOf(selector[2]);
                //myjavatextview.setText(window);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dropdown1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //myjavatextview.setText(String.valueOf(position));
                //selector[1] = position;
                //window = String.valueOf(selector[0]) + String.valueOf(selector[1]) + String.valueOf(selector[2]);
                //myjavatextview.setText(window);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dropdown2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //myjavatextview.setText(parent.getItemAtPosition(position).toString());
                //selector[2] = position;
                //window = String.valueOf(selector[0]) + String.valueOf(selector[1]) + String.valueOf(selector[2]);
                //myjavatextview.setText(window);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
