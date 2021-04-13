public class ManagerStaff {
    private Staff [] staffs;

    public Staff[] getStaffs() {
        return staffs;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }
    public void getInforAllStaff(){
        for (Staff s : staffs){
            System.out.println(s.toString());
        }
    }
    public StaffFullTime[] getAllFullTime(){
        StaffFullTime[] staffFulltimes = new StaffFullTime[staffs.length];
        int count = 0;
        for (Staff s : staffs){
            if (s instanceof StaffFullTime) {
                if (s != null) {
                    staffFulltimes[count] = (StaffFullTime) s;
                    count++;
                }
            }
        }
        return staffFulltimes;
    }
    public double getAVG(){
        double sum = 0;
        double count = 0;
        for (int i = 0; i < staffs.length ; i++) {
            if(staffs[i]!=null) {
                sum += staffs[i].getAmountOfStaffs();
                count++;
            }
        }
        return sum/count;
    }
    public  StaffFullTime[] getFullTimeLowerAVG(){
        StaffFullTime[] staffFullTimes= this.getAllFullTime();
        double avg = this.getAVG();
        StaffFullTime[] staffFulltimes = new StaffFullTime[staffFullTimes.length];
        int count = 0;
        for (StaffFullTime s : staffFullTimes ){
            if (s!=null) {
                if (s.getHardSalary() < getAVG()) {
                    staffFulltimes[count] = s;
                    count++;
                }
            }
        }return staffFulltimes;
    }
}
