public class Lab_CLI_excercise {
    public static void main(String[] args){
        String age_input_string= args[3];
        System.out.println(age_input_string != null);

        assert age_input_string != null;
        int age_user_input=Integer.parseInt(age_input_string);

        String result= (age_user_input<=18) ? "minor" : (age_user_input<=60) ? "Adult" : "Sr.citizen" ;
        System.out.println(result);
    }

}
