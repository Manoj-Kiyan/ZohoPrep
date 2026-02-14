/*
We’ll use this input:

logs = [[1950,1961],[1960,1971],[1970,1981]]

👤 Person Details

Let’s name them:

A = [1950,1961]
B = [1960,1971]
C = [1970,1981]


Remember:

👉 Alive in range:

[birth , death-1]

🟢 Person A
1950 → 1960


So A is alive in:

1950,51,52,53,54,55,56,57,58,59,60

🟢 Person B
1960 → 1970


Alive in:

1960,61,62,63,64,65,66,67,68,69,70

🟢 Person C
1970 → 1980


Alive in:

1970,71,72,73,74,75,76,77,78,79,80

⭐ NOW LET’S CHECK 1960
Is A alive in 1960?

A alive till 1960

✅ YES

Is B alive in 1960?

B starts at 1960

✅ YES

Is C alive in 1960?

C starts at 1970

❌ NO

👉 So in 1960:
A + B = 2 people

⭐ NOW LET’S CHECK 1970
A alive in 1970?

A died at 1961
Alive only till 1960

❌ NO

B alive in 1970?

B alive till 1970

✅ YES

C alive in 1970?

C starts at 1970

✅ YES

👉 So in 1970:
B + C = 2 people

✅ Final Result
Year	Alive
1960	A + B = 2
1970	B + C = 2

Maximum = 2
Earliest = 1960

🧠 One-Line Logic

Population becomes 2 when two life ranges overlap.
*/
public class Max_Population {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        int ans=maximumPopulation(logs);
        System.out.println(ans);
    }

   
    public static  int maximumPopulation(int[][] logs) {
        int[] year=new int[2051];

        for(int[] l : logs){
            year[l[0]]++;
            year[l[1]]--;
        }
        int max=0;
        int ans=0;
        int cur=0;

        for(int i=1950;i<=2050;i++){
            cur +=year[i];

            if(cur > max){
                max = cur;
                ans =i;
            }
        }
        return ans;
    }
}

