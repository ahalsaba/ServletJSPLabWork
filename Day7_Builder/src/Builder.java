/**
 * Created by ahalsaba on 7/13/2016.
 */
public class Builder {
    public  class Target{
        int fieldA;
        int fieldB;
        int fieldC;
        int fieldD;
        int fieldE;

        public Target(){
            new builder();
        }
        private boolean isValid(){
            if (fieldA > fieldB || fieldC == 0){
                throw new IllegalArgumentException();
            }


            return true;
        }
       public  builder factory(){
           builder c = new builder();
            return c;
        }

        public  class builder{
            public Target a;
            public builder(){
                a = new Target();
            }
            public void one(){
                fieldA= 1;
            }
            public void two(){
                fieldB= 2;
            }
            public void three(){
                fieldC= 3;
            }
            public void four(){
                fieldD= 4;
            }
            public void five(){
                fieldE= 5;
            }
            public Target build(){
                if (a.isValid()){
                    return a;
                }
                return null;
            }
        }
    }


    public  void main(String[] args){
        Target blah = new Target();
        Target.builder b = blah.factory();
        b.one();
        b.two();
        b.three();
        b.four();
        b.five();
        blah = b.build();


    }

}
