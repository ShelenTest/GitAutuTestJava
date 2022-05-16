package HW4;

public class Triangle {

    public double aria (int a, int b, int c) throws MyException {
        if (a<=0 || b<=0 || c<=0) throw new MyException("Передано неположительное число");
        double p = ((double)a +(double)b+(double)c)/2;
        double area =  Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public boolean triangleOrNo (int a, int b, int c) throws ExceptionNotTriangle {
        if (a + b > c && a + c > b && b + c > a)
            return true;
        else {
            throw new ExceptionNotTriangle("Из таких длинн сторон треугольник не построить");
        }
    }
    }
