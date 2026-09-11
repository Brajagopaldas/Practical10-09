class Notes {
    public static void main(String[] args) {
        
        int amount = 1870;

        int note500 = amount / 500;
        amount = amount % 500;

        int note200 = amount / 200;
        amount = amount % 200;

        int note100 = amount / 100;
        amount = amount % 100;

        int note50 = amount / 50;
        amount = amount % 50;

        int note20 = amount / 20;

        System.out.println("___________Total Amount____________");
        System.out.println("Note ₹ 500 =  " + note500);
        System.out.println("Note ₹ 200 =  " + note200);
        System.out.println("Note ₹ 100 =  " + note100);
        System.out.println("Note ₹ 50 =  " + note50);
        System.out.println("Note ₹ 20 =  " + note20);

    }
}    
