public class Main {
    public static void main(String[] args) {
        MyQueue BarberShopLine = new MyQueue();

        BarberShopLine.enQueue( "Ninja" );
        BarberShopLine.enQueue( "Druski" );
        BarberShopLine.enQueue( "Kai" );
        BarberShopLine.enQueue( "Speed" );
        BarberShopLine.enQueue( "Duke" );
        BarberShopLine.enQueue( "DanTDM" );

        System.out.println(BarberShopLine.isEmpty());
        

System.out.println("People waiting to get low taper fades:");
        for (int i = 0; i<6; i++){
           System.out.println(BarberShopLine.getNext("Ninja"));

        }






    }


}
