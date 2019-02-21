package Lab;

public class Model {
    private static String occpation = "modeling";

    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private boolean canTravel;
    private boolean smokes;

    public Model() {
        setFirstName("lastname");
        setLastName("lastname");

    }

    public Model(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);

    }



    public Model(String firstName, String lastName, int height, int weight, boolean canTravel, boolean smokes) {

        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);

    }

    public Model(String firstName, String lastName, int height, int weight) {

    }

    public void setFirstName (String firstName){
        if ((firstName != null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isCanTravel() {
        return canTravel;
    }

    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    public boolean isSmokes() {
        return smokes;
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getWeight());
        System.out.println("wheight: " + Math.round(getWeight()));


    if(canTravel == true){
            System.out.println("Does travel ");
        }else{
            System.out.println("Does not travel ");
        }
        if(smokes == true){
            System.out.println("Does smoke ");
        }else{
            System.out.println("Does not smoke ");
        }
    }

}