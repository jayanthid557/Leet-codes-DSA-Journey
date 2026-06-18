public class reversion {

    static int count = 0;

    static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            countPairs(arr, low, mid, high);

            merge(arr, low, mid, high);
        }
    }


    static void countPairs(int[] arr, int low, int mid, int high) {

        int j = mid + 1;

        for (int i = low; i <= mid; i++) {

            while (j <= high && arr[i] > 2 * arr[j]) {
                j++;
            }

            count += j - (mid + 1);
        }
    }


    static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;


        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }


        while (i <= mid) {
            temp[k++] = arr[i++];
        }


        while (j <= high) {
            temp[k++] = arr[j++];
        }


        for (int x = 0; x < temp.length; x++) {
            arr[low + x] = temp[x];
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 3, 1};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Reverse Pairs: " + count);
    }
}

