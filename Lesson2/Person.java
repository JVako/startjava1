public class Person {
        String gender = "man";
        String name = "Valley";
        double height = 132,5;
        double weight = 30,2;
        int age = 10;
        int sit, go, run, speak,learnJava;
    public Person( int sit, go, run, speak, learnJava){
            sit = startSit;
            go = startGo;
            run = startRun;
            speak = startSpeak;
            learnJava = startLearnJava;
        }
        public void setSit ( int newValue){
            sit = newValue;
        }
        public void setGo ( int newValue){
            go = newValue;
        }
        public void setRun ( int newValue){
            run = newValue;
        }
        public void setSpeak ( int newValue){
            speak = newValue;
        }
        public void setLearnJava ( int newValue){
            learnJava = newValue;
        }
    }

