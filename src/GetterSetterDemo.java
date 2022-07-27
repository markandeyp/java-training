public class GetterSetterDemo {
    private String firstName;
    private String lastName;

    public void setName(String name) {
        if(name != null){
            String[] splitedName = name.split(" ");
            firstName = splitedName[0];
            if(splitedName.length > 1){
                lastName = splitedName[1];
            }
        }
    }

    public String getName(){
        return String.format("First: %s Last: %s", firstName, lastName);
    }
}
