class Main {
  public static void main(String[] args) {
   
        String polecenie = args[0];

        if (polecenie.equals("silnia") && args.length > 1) {
            int arg1 = Integer.parseInt(args[1]);
            int silnia = 1;
            int a = 1;
            int i;
            for (i = 0; i < arg1; i++) {
                silnia = silnia * a;
                a = a + 1;
            }
            System.out.println("permutacje=" + silnia);
        }  if (polecenie.equals("kombinacje") && args.length > 2) {
            int arg1 = Integer.parseInt(args[1]);
            int arg2 = Integer.parseInt(args[2]);
            int npok = 1;
            int b = 1;
            int b2 = 1;
            for (int i = (arg1 - arg2) + 1; i <= arg1; i++) {
                b *= i;
            }
            for (int j = 1; j <= arg2; j++) {
                b2 *= j;
            }
            npok = b / b2;

            System.out.println("kombinacje=" + npok);
        }  if (polecenie.equals("wariacje") && args.length > 2) {
            int arg1 = Integer.parseInt(args[1]);
            int arg2 = Integer.parseInt(args[2]);
            int wariacje, silnia1 = 1, silnia12 = 1, a = 1, b = 1, i;
            for (i = 0; i < arg1; i++) {
                silnia1 = silnia1 * a;
                a = a + 1;
            }
            for (i = 0; i < (arg1 - arg2); i++) {
                silnia12 = silnia12 * b;
                b = b + 1;
            }
            wariacje = silnia1 / silnia12;
            System.out.println("Wariacja bez powt. " + arg2 + "-wyrazowa zbioru " + arg1 + "-elementowego = " + wariacje);

        } else {
            System.out.println("Bledne argumenty");
        }
    }

  }
