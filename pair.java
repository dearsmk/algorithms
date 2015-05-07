//You're given an array of integers(eg [3,4,7,1,2,9,8]) Find the index of values that satisfy A+B = C + D, where A,B,C & D are integers values in the array.

//Eg: Given [3,4,7,1,2,9,8] array
//The following
//3+7 = 1+ 9 satisfies A+B=C+D
//so print (0,2,3,5)


public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 9, 8};
        findFactors(arr);
    }

    static class Factors {
        public Factors(int A, int B) {
            this.A = A;
            this.B = B;
        }
        int A;
        int B;
    }

    public static void findFactors(int[] arr) {
        Map<Integer, Factors> m = new HashMap<>();
        int aux = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                aux = arr[i] + arr[j];
                if (m.containsKey(aux)) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + arr[m.get(aux).A] + " + " + arr[m.get(aux).B]);
                    System.out.println("(" + i + "," + j + "," + m.get(aux).A + "," + m.get(aux).B + ")");
                } else {
                    m.put(aux, new Factors(i, j));
                }
            }
        }
    }
