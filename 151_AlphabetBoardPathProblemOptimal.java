import java.util.*;

class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder path = new StringBuilder();
        int currentX = 0, currentY = 0;

        for (char ch : target.toCharArray()) {
            int targetX = (ch - 'a') / 5;
            int targetY = (ch - 'a') % 5;

            // Special handling for 'z'
            if (ch == 'z') {
                targetX = 5;
                targetY = 0;
            }

            // Move up or down first to avoid invalid moves when moving from or to 'z'
            if (currentX == 5) {
                while (currentX > targetX) {
                    path.append('U');
                    currentX--;
                }
            }

            // Move horizontally first
            while (currentY > targetY) {
                path.append('L');
                currentY--;
            }
            while (currentY < targetY) {
                path.append('R');
                currentY++;
            }

            // Move vertically
            while (currentX > targetX) {
                path.append('U');
                currentX--;
            }
            while (currentX < targetX) {
                path.append('D');
                currentX++;
            }

            path.append('!');
        }

        return path.toString();
    }
}
