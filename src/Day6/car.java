package Day6;

class car {
    private String model, color;
    private int year, inputYear;

    public void setModel(String modelName){
        this.model = modelName;
    }
    public void setColor(String colorName){
        this.color = colorName;
    }
    public void setYear(int yearValue) {
        this.year = yearValue;
    }

    public String getModel(){
        return model;
    }
    public String getColor(String white){
        return color;
    }
    public int getYear(){
        return year;
    }

    void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference(int inputYear){
        this.inputYear = inputYear - year;
        return this.inputYear;
    }


}


