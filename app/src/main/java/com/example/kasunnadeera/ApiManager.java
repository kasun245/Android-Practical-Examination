package com.example.kasunnadeera;

public class ApiManager {
    private int res_code;
    private String res_desc;
    private String user_data;

    public class UserData{
        private String id;
        private String email;
        private String name;
        private String dob;
        private String gender;
        private String company;
        private String position;

        public UserData(String id, String email, String name, String dob, String gender, String company, String position){
            this.company = company;
            this.dob = dob;
            this.id=id;
            this.email = email;
            this.name = name;
            this.gender = gender;
            this.position = position;
        }
    }
    public ApiManager(int res_code, String res_desc, String user_data ){
        this.res_code = res_code;
        this.res_desc = res_desc;
        this.user_data = user_data;
    }

}
