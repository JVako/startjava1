public class WolfTestSetGet {
    public static void main(String[] args) {
        WolfSetGet wolfSG = new WolfSetGet();
        wolfSG.setAge();
        wolfSG.setGender();
        wolfSG.setName();
        wolfSG.setWeight();
        wolfSG.setColor();
        wolfSG.setGo();
        wolfSG.setSit();
        wolfSG.setRun();
        wolfSG.setHowl();
        wolfSG.setHunt();
        WolfTestSetGet wolfTSG = new WolfTestSetGet();
        //wolfTSG.getAge();
        //wolfTSG.getGender();
    }

    public int getAge() {
        System.out.println("WolfTest (getAge) - working!");
        return getAge();
    }

    public String getGender() {
        System.out.println("WolfTest (getGender) - working!");
        return getGender();
    }

    public String getName() {
        System.out.println("WolfTest (getName) - working!");
        return getName();
    }

    public int getWeight() {
        System.out.println("WolfTest (getWeight) - working!");
        return getWeight();
    }

    public String getColor() {
        System.out.println(("WolfTest (getColor) - working!"));
        return getColor();
    }

    public int getGo() {
        System.out.println(("WolfTest (getGo) - working!"));
        return getGo();
    }

    public String getSit() {
        System.out.println(("WolfTest (getSit) - working!"));
        return getSit();
    }

    public int getRun() {
        System.out.println(("WolfTest (getRun) - working!"));
        return getRun();
    }

    public String getHowl() {
        System.out.println(("WolfTest (getHowl) - working!"));
        return getHowl();
    }

    public String getHunt() {
        System.out.println(("WolfTest (getHunt) - working!"));
        return getHunt();
    }
}

