class GstCalculation {
    public static void main(String[] args) {
        
        double productPrice = 5500.00;
        double discountPercent = 10.0;
        double gstPercent = 18.0;

        double discountAmount = (productPrice * discountPercent) / 100;

        double discountedPrice = productPrice;
        discountedPrice -= discountAmount;

        double gstAmount = (discountedPrice * gstPercent) / 100;

        double finalAmount = discountedPrice;
        finalAmount += gstAmount;

        System.out.println("Original Price   : " + productPrice);
        System.out.println("Discount (" + discountPercent + "%)  : " + discountAmount);
        System.out.println("Price After Disc : " + discountedPrice);
        System.out.println("GST (" + gstPercent + "%)       : " + gstAmount);
        System.out.println("--------------------------------");
        System.out.println("Final Bill Amount: " + finalAmount);
    }
}
