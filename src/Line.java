public class Line {
    public static final Gate A = new Gate("A",0);
    public static final Gate B = new Gate("B",5);
    public static final Gate C = new Gate("C",8);
    public static final Gate D = new Gate("D",14);

    public static int getFare(int distance)
    {
        return 120 + (Math.max(distance-3,0)/2)*30;
    }
}
