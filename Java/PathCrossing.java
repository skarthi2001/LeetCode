import java.util.HashSet;
public class PathCrossing {
    public boolean isPathCrossing(String path) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(0);
        int len = path.length();
        int x = 0;
        int y = 0;
        for(int i = 0; i < len; i++){
            switch(path.charAt(i)){
                case 'N':
                y++;
                break;
                case 'E':
                x++;
                break;
                case 'S':
                y--;
                break;
                default:
                x--;
                break;
            }
            int number = (x << 14) + y;
            if(numbers.contains(number)) return true;
            numbers.add(number);
        }
        return false;
    }
}
