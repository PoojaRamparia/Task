import java.util.Arrays;

public class Balance
{
    public static void Balance(int[] bal) {
        int before = 0;
        int after = 0;

        for (int i = 0; i < bal.length; i++) {
            after += bal[i];
        }

        for (int i = 0; i < bal.length; i++) {
            after = after - bal[i];
            if (after == before) {
                System.out.println(i);

            }
            before += bal[i];
            // System.out.println(i);
            }

    }
    public static void main(String args[])
    {
        int [][] Bal =
                {
                        {3,-2,2,0,3,4,-6,3,5,-4,8},
                        {9, 0, -5, -4, 1, 4, -4, -9, 0, -7, -1},
                        {9, -7, 6, -8, 3, -9, -5, 3, -6, -8, 5}
                };

        Arrays.stream(Bal).forEach((int[] Bal1) ->
        {
            Balance(Bal1);
        });

    }
}

