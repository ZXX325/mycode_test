package day2;

public class Test {
    public static void main(String[] args) {
        //创建一维数组并初始化
        int a[] = {100, 200, 300, 400, 500};
        int b[] = new int[]{100, 200, 300, 400, 500};
        //创建二维数组
        String c[][] = {{"java", "html"}, {"css", "javascript"}};
        String d[][] = new String[2][2];
        d[0][0] = "java";
        d[0][1] = "css";
        d[1][0] = "html";
        d[1][1] = "javascript";
        System.out.println("数组d:");
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.println(d[i][j]);
            }
        }

    }
}
