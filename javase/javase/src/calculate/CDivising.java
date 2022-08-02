/*
 * @Author: YPL
 * @Date: 2022-08-02 16:09:37
 * @Description: 
 */
package calculate;

public class CDivising implements ICompute{

    @Override
    public int computer(int num1, int num2) {
        // TODO Auto-generated method stub
        int ans  =0;
        try{
            ans = num1 / num2;
        }catch(Exception e){
            e.printStackTrace();
        }
        return ans;
    }
}
