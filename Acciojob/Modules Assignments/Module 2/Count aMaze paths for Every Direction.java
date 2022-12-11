public static int countAllPath(int sr,int sc,int dr, int dc,boolean[][] visited){

		if(sr>dr||sc>dc||sr<1||sc<1) return 0;
		if(visited[sr][sc]) return 0;
		if(sr==dr&&sc==dc) return 1;

		visited[sr][sc]=true;
		int count=0;
		//horizontal moves
		count+=countAllPath(sr,sc+1,dr,dc,visited);
		count+=countAllPath(sr,sc-1,dr,dc,visited);

		//Vertical moves
		count+=countAllPath(sr+1,sc,dr,dc,visited);
		count+=countAllPath(sr-1,sc,dr,dc,visited);

		//Diagonal moves
		count+=countAllPath(sr+1,sc+1,dr,dc,visited);
		count+=countAllPath(sr-1,sc-1,dr,dc,visited);
		count+=countAllPath(sr+1,sc-1,dr,dc,visited);
		count+=countAllPath(sr-1,sc+1,dr,dc,visited);

		visited[sr][sc]=false;
		return count;
	}
    static int countAllPath(int n, int m)
    {
        //Write your code here
		boolean[][] visited = new boolean[n+1][m+1];

		return countAllPath(1,1,n,m,visited);
    }
