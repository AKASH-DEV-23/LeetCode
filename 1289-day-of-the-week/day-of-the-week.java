class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int last2=findYear(year);
        int last2Rem=last2/4;
        int month2=findMonth(month);
        int decade=findDecade(year);
        int leap=(year%4==0 && year%100 !=0) || (year%400==0) ? -1:0;
        int sum=day+month2+last2+last2Rem+decade;
        if (leap == -1 && (month == 1 || month == 2)) {
            sum -= 1;
        }
        sum = sum % 7;
        return findDay(sum);
    }
    private String findDay(int day){
        String res="";
        switch(day){
            case 0:
                res="Sunday";
                break;
            case 1:
                res="Monday";
                break;
            case 2:
                res="Tuesday";
                break;
            case 3:
                res="Wednesday";
                break;
            case 4:
                res="Thursday";
                break;
            case 5:
                res="Friday";
                break;
            case 6:
                res="Saturday";
        }
        return res;
    }
    private int findDecade(int year){
        if(year <= 1999) return 0;
        else if(year>=2000 && year<=2099)   return 6;
        return 4;
    }
    private int findYear(int year){
        int res=0;
        int rem1=year%10;
        year=year/10;
        int rem2=year%10;
        res=res*10+rem2;
        res=res*10+rem1;
        return res;
    }
    private int findMonth(int month){
        int res=0;
        switch(month){
            case 1:
                res=0;
                break;
            case 2:
                res=3;
                break;
            case 3:
                res=3;
                break;
            case 4:
                res=6;
                break;
            case 5:
                res=1;
                break;
            case 6: 
                res=4;
                break;
            case 7:
                res=6;
                break;
            case 8:
                res=2;
                break;
            case 9:
                res=5;
                break;
            case 10:
                res=0;
                break;
            case 11:
                res=3;
                break;
            case 12:
                res=5;
        }
        return res;
    }
}