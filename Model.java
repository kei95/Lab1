package Lab;

/**
 * @Authur Kei
 *
 */

public class Model {
    private static String occpation = "modeling";

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     *
     */

    //method overloding
    public Model() {


    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param WeightKg
     * @param canTravel
     * @param smokes
     */

    public Model(String firstName, String lastName, int height, double WeightKg, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(WeightKg);
        setCantravel(canTravel);
        this.smokes = smokes;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */

    public Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCantravel(true);
        setSmokes(false);
    }
    //getters

    /**
     *
     * @return
     */

    public static String getOccpation() {
        return occpation;
    }


    /**
     * Getter for fistName
     * @return firstName
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return
     */

    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return
     */

    public int getHeight() {
        return height;
    }

    public String setHeightInFeetAndInches(){
        int feet = height / 12; // inches
        int inches = height % 12;
        String footUnit = "";
        String inchUnit = "";

        if(inches > 1){
            inchUnit = inches + " inches";
        } else if(inches == 1){
            inchUnit = inches + " inche";
        }else{
            return footUnit;
        }

        if(feet > 1){
            footUnit = feet + " feet";
        } else if(feet == 1){
            footUnit = feet + " foot";
        }else{
            return inchUnit;
        }

        return footUnit + inchUnit;

    }
    //"x feet y inch(es)"


    /**
     *
     * @return
     */

    public double getWeight() {
        return weight;
    }

    /**
     * Getter for weight as Kgs
     * @return weight as Kgs
     */
    public long getWeightKg(){
        return Math.round(weight * 0.45);
    }


    /**
     *
     * @return
     */

    public boolean isCanTravel() {
        return canTravel;
    }








    //mutators



    public final void setCantravel(boolean canTravel){
        this.canTravel = canTravel;
    }

    public final void setFirstName (String firstName){
        if ((firstName != null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
            this.firstName = firstName;
        }
    }

    public final void setLastName (String lastName){
        if ((lastName != null) && (lastName.length() >= 3) && (lastName.length() <= 20)) {
            this.lastName = lastName;
        }
    }


    public final void setHeight(int inches) {
        if (inches > 24 && inches <= 84) {
            this.height = inches;
        }
    }

    public final void setHeight(int feet,int inches) {
        int inInches = feet * 12 + inches;
        if (inInches >= 24 && inInches <= 84){
            this.height = inInches;
        }
    }



    public final void setWeight(double pounds) {
        if(pounds >=80 && pounds <= 280) {
            this.weight = pounds;
        }
    }

    public final void setWeight(long kilograms) {
        double inPounds = kilograms * 2.205;
        if(inPounds >= 80 && inPounds <= 280){
            this.weight = inPounds;
        }
    }


    public boolean isSmokes() {
        return smokes;
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }


    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
                System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
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