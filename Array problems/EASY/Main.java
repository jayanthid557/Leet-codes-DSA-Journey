class Main {
    public static void main(String[] args) {
        int[] arr1 = {4,1,2,1,2};

        for (int i = 0; i < arr1.length; i++) {
            int count = 0;

            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr1[i]);
                return;
            }
        }
    }
}