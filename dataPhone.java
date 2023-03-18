public class dataPhone {
    private String name, number;
  
    public dataPhone(String name,String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name+"_"+number;
    }

}
