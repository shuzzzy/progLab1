public class jaba {
    static void firstArray(short[] arr, short value){
        for(int i = 0; i < 7; i++){
            arr[i] = value ;
            value += 2;
        }

    }

    static void secondArray(float[] arr, short value){

        for(int i = 0; i < value; i++){

            arr[i] = (float) (Math.random() * (7 - (-13))) - 13;

        }

    }

    public static void main(String[] args){

        final float fraction1 = (float) (1.0 / 3);
        final float fraction2 = (float) (1.0 / 4);
        final short maxRange = 11;
        final short minRange = 6;


        short[] a = new short[7];
        jaba.firstArray(a, minRange);

        float[] x = new float[maxRange];
        jaba.secondArray(x, maxRange);

        double[][] b = new double[minRange][maxRange];
        for(int i = 0; i < minRange; i++){
            for(int j = 0; j < (maxRange); j++){
                if(a[i] == 8){
                    b[i][j] = (double) fraction1 * (2 + 2 * Math.cos(x[j]));
                }
                else if (a[i] == 6 || a[i] == 14 || a[i] == 16){
                    b[i][j] = Math.pow(((Math.atan(Math.sin(x[j])) - 1) / (Math.pow(Math.E, Math.cbrt(x[j])))), Math.atan(Math.sin(x[j])));
                }
                else{
                    b[i][j] = Math.cbrt(Math.pow(Math.pow((fraction2 + Math.exp(Math.abs(x[j]))), Math.pow(x[j] / (0.25 - x[j]), x[j])) + 1, 3));
                }
            }
        }

        System.out.println("First array:");
        for(int i = 0; i < minRange; i++){

            System.out.print(" " + a[i] + " ");

        }

        System.out.println();
        System.out.println();

        System.out.println("Second array:");
        for(int i = 0; i < maxRange; i++){
            System.out.print(" " + x[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Third array:");
        for(int i = 0; i < minRange; i++){
            for(int j = 0; j < (maxRange); j++){
                String answ = String.valueOf(b[i][j]);
                if(answ.equals("NaN")) {
                    answ = "0.0000";
                }
                else{
                    answ = String.format("%.4f", b[i][j]);
                }
                System.out.print(answ + " ");
            }
            System.out.println();
        }
    }
}