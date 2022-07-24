public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int a = status.getAltitude();
        int v = status.getVelocity();
        int burn = 0;
//        int burn = (v*v)/ (2 * a);
        if (a < 2200 ) {
            burn = a * v;
            return burn;
        } else if (a < 2000 ) {
            burn = (v*v)/ (2 * a);
            return burn;
        }

        System.out.println(burn); /*hack!*/
        return burn;

    }
}
