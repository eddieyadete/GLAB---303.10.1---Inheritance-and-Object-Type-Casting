public class Girl extends Person {
    static double ageFactor = 1.3;

    public Girl(String aName){
        name = "Ms. " + aName;
    }

    @Override
    public String talk(){

        return ("Hello! " + jump());
    }
    public String jump(){

        return("i am jumping");
    }
    public static double lifeSpan(){

        return (LifeSpan * ageFactor);
    }
}