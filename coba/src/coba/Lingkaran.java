package coba;

class Lingkaran {
    private int diameter = 4;
    public int getDiameter(){
        try{
            return diameter;
        }finally{
            System.out.println("dikirim");
        }
    }
}

class New{
    public static void main(String[] args) {
        Lingkaran circle = new Lingkaran();
        int d = circle.getDiameter();
        System.out.println(d);
    }
}