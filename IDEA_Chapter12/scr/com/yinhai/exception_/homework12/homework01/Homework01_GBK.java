

/**
 * @author ����
 * @version 1.0
 */
/*a)��дӦ�ó���EcmDef,����������(��main���������String[] args����)����������(����)���������������

 b)���������������Ҫ��ʹ�÷���cal(int n1, int n2)

 c)�����ݸ�ʽ����ȷ��ȱ�������в�������0�����쳣����
*/

class Homework01_GBK {
    public static void main(String[] args) {

        //��֤����ĸ����Ƿ���ȷ
        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("���鳤���쳣");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1,n2);//�÷��������׳������쳣
            System.out.println("���������" + res);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("������������");
        }
        catch (NumberFormatException e) {
            System.out.println("������ʽ���ԣ�����������");
        }catch (ArithmeticException e){
            System.out.println("���ֳ���Ϊ0");
        }


    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}

