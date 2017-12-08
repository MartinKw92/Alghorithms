public class DiagonalMatrix {

    public void print(int size) {


        // traverse rows
        for (int i=0;i<size;i++) {
            // traverse cols
            for (int j=0;j<size;j++) {
                if (i==j) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0 + " ");
                }

            }
            System.out.println();
        }
    }

    public void printFaster(int size) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<size;i++) {
            if (i!=0) {
                stringBuffer.append(" ");
            }
            System.out.println(stringBuffer.toString()+1);
        }
    }

}
