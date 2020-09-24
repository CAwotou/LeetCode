//import java.lang.reflect.Array;
//import java.util.*;
//
//public class minimalSteps {
//    int dx[]={1,-1,0,0};
//    int dy[]={0,0,1,-1};
//    int n,m;
//
//    public int mini(String maze[]){
//        m=maze.length;
//        n=maze[0].length();
//        List<int[]>buttons=new ArrayList<>();
//        List<int[]>stones=new ArrayList<>();
//        int sx=-1,sy=-1,tx=-1,ty=-1;//s:start;t:target
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(maze[i].charAt(j)=='M'){
//                    buttons.add((new int[]{i,j}));
//                }
//                if(maze[i].charAt(j)=='O'){
//                    stones.add(new int[]{i,j});
//                }
//                if(maze[i].charAt(j)=='S'){
//                    sx=i;
//                    sy=j;
//                }
//                if(maze[i].charAt(j)=='T'){
//                    tx=i;
//                    ty=j;
//                }
//            }
//        }
//
//        int nb=buttons.size();
//        int ns=stones.size();
//        int startDist[][]=bfs(sx,sy,maze);
//
//        //No buttons
//        if(nb==0){
//            return startDist[tx][ty];
//        }
//        return 0;
//
//    }
//
//    public int[][] bfs(int x,int y,String[] maze){
//        int ret[][]=new int[n][m];
//        for(int i=0;i<n;i++){
//            Arrays.fill(ret[i],-1);
//        }
//        ret[x][y]=0;
//        Queue<int[]>queue =new LinkedList<>();
//        queue.offer(new int[]{x,y});
//        while (!queue.isEmpty()){
//            int p[]=queue.poll();
//            int curx=p[0],cury=p[1];
//            for(int k=0;k<4;k++){
//                int nx=curx+dx[k],ny=cury+dy[k];
//                if(inBound(nx,ny)&&maze[nx].charAt(ny)!='#'&&ret[nx][ny]==-1){
//                    ret[nx][ny]=ret[curx][cury]+1;
//                    queue.offer(new int[]{nx,ny})；
//                }
//            }
//        }
//        return ret;
//    }
//    public boolean inBound(int x,int y){
//        return x>=0&&x<n&&y>=0&&y<m;
//    }
//
//}
