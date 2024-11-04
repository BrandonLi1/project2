public class LinearEquation {
    int x1;
    int x2;
    int y1;
    int y2;




    public LinearEquation (int x1, int y1, int x2, int y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }




    public double distance () {
        double x= Math.pow(x2-x1,2);
        double y= Math.pow(y2-y1,2);
        return roundedToHundredth(Math.sqrt(x+y));
    }




    public double yIntercept() {
        return roundedToHundredth(y1-((double) (y2 - y1) /(double) (x2-x1)*x1));
    }




    public double slope() {
        return roundedToHundredth((double) (y2 - y1) /(double) (x2-x1));
    }




    public String equation() {
        int y= y2-y1;
        int x= x2-x1;
        if (yIntercept()<0) {
            if (y<0 && x<0) {
                y=-y;
                x=-x;
            }
            if (y1==y2) {
                return "y = " + yIntercept();
            }
            if (x2==x1) {
                return "vertical line at x=" + x2;
            }
            if (((double)y/x)%1==0) {
                if (x<0 && y>0) {
                    return "y = " + (y/x) + "x - " + -yIntercept();
                }
                return "y = " + (y / x) + "x - " + -yIntercept();
            }
            if (y==x) {
                return "y = x - " + -yIntercept();
            }
            if ((double)y/x==-1) {
                return "y = -x - " + -yIntercept();
            }
            if (yIntercept()==0) {
                return "y = " + y + "/" + x + "x";
            }
            if (x<0 && y>0) {
                return "y = " + -y + "/" + -x + "x - " + -yIntercept();
            }

            return "y = " + y + "/" + x + "x - " + -yIntercept();
        } else {
            if (y<0 && x<0) {
                y=-y;
                x=-x;
            }
            if (y1==y2) {
                return "y = " + yIntercept();
            }
            if (x2==x1) {
                return "vertical line at x=" + x2;
            }
            if (((double)y/x)%1==0) {
                if (yIntercept()==0) {
                    if (y==x) {
                        return "y = x";
                    }
                    if ((double)y/x==-1) {
                        return "y = -x";
                    }
                    return "y = " + y/x + "x";
                }
                if (x<0 && y>0) {
                    if (y==x) {
                        return "y = x + " + yIntercept();
                    }
                    if ((double)y/x==-1) {
                        return "y = -x + " + yIntercept();
                    }
                    return "y = " + (y/x) + "x + " + yIntercept();
                }
                if (y==x) {
                    return "y = x + " + yIntercept();
                }
                if ((double)y/x==-1) {
                    return "y = -x " + yIntercept();
                }
                return "y = " + (y / x) + "x + " + yIntercept();
            }
            if (y==x) {
                return "y = x + " + yIntercept();
            }
            if ((double)y/x==-1) {
                return "y = -x + " + yIntercept();
            }
            if (x<0 && y>0) {
                return "y = " + -y + "/" + -x + "x + " + yIntercept();
            }


            if (yIntercept()==0) {
                return "y = " + y + "/" + x + "x";
            }
            if (x<0 && y>0) {
                return "y = " + -y + "/" + -x + "x - " + yIntercept();
            }
        }
        return "y = " + y + "/" + x + "x + " + yIntercept();
    }




    public String coordinateForX(double x) {
        return "(" + x + ", " + roundedToHundredth(slope()*x + yIntercept()) + ")";
    }




    public String lineInfo() {
        String l1 = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
        String l2 = "The equation of the line between these points is: " + equation();
        String l3 = "The y-intercept of this line is: " + yIntercept();
        String l4 = "The slope of this line is: " + slope();
        String l5 = "The distance between these points is : " + distance();
        return l1 + "\n" + l2 + "\n" + l3 + "\n" + l4 + "\n" + l5;
    }




    private double roundedToHundredth (double toRound) {
        return Math.round(toRound*100) / 100.0;
    }
}