//
public class Day5_1 {
            public static void main(String[] args){

            car newcar = new car();
            newcar.setModel("Volvo");
            newcar.setColor("Red");
            newcar.setYear(2020);
            System.out.println(newcar.getModel());
            System.out.println(newcar.getColor());
            System.out.println(newcar.getYear());


        }}

    class car{
        private String model, color;
        private int year;

        public void setModel(String modelName){
            model = modelName;
        }
        public void setColor(String colorName){
            color = colorName;
        }
        public void setYear(int yearValue) {
            year = yearValue;
        }

        public String getModel(){
            return model;
        }
        public String getColor(){
            return color;
        }
        public int getYear(){
            return year;
        }



    }


