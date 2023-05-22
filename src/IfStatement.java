public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;
        if (isBluetoothEnable) {
            //Send file
            fileSended ++;
            System.out.println("archivo enviado");
        } else {
            System.out.println("Enciende el bluetooth");
        }
    }
}
