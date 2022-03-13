package leetcode;/**
 * Created by Administrator on 2022/2/23.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author liwenming
 * @Description //算法测试类，用于在多个时间段中计算出时间段最多的重叠次数，应用场景：在已知多个时间端是设备的在线时间段时，求设备同时在线的最大值
 * @Date 2022/2/23 19:56
 **/
public class TimeOverlapUtil {

    public static int calcMaxOverlap(List<Point> pointList) {
        int count = 0;
        int maxOverlap = 0;
        for (Point point : pointList) {
            if (point.getType() == 0) {
                count++;
                maxOverlap = Math.max(count, maxOverlap);
            } else {
                count--;
            }
        }
        return maxOverlap;
    }

    public static class Point {
        Date time;
        Integer type;

        public Point(Date time, Integer type) {
            this.time = time;
            this.type = type;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }
    }

    public static class PointFactory {
        List<Date[]> timeList = new ArrayList<>();

        public PointFactory() {
        }

        public void push(Date[] period) {
            timeList.add(period);
        }

        public List<Point> createPointList() {
            List<Point> pointList = new ArrayList<>(timeList.size());
            timeList.forEach(period -> {
                pointList.add(new Point(period[0], 0));
                pointList.add(new Point(period[1], 1));
            });
            pointList.sort((o1, o2) -> {
                if (o1.getTime().getTime() != o2.getTime().getTime()) {
                    return (int) (o1.getTime().getTime() - o2.getTime().getTime());
                }
                // 一个时间段的结束时间和另一个时间段的起始时间相同时，不算为重叠
                // 时间值相等时，终点排前面
                //  return o2.getType() - o1.getType();
                // 一个时间段的结束时间和另一个时间段的起始时间相同时，算为重叠
                // 时间值相等时，终点排后面
                return o1.getType() - o2.getType();
            });
            return pointList;
        }
    }

    public static void main(String[] args) throws ParseException {
        PointFactory pointFactory = new PointFactory();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String startDateStrs[] = {"2022-02-23 00:00:00", "2022-02-23 00:30:00", "2022-02-23 02:00:00", "2022-02-23 00:59:00", "2022-02-23 02:30:00","2022-02-23 02:30:00", "2022-02-23 02:30:00", "2022-02-23 02:30:00"};
        String endDateStrs[] = {"2022-02-23 01:00:00", "2022-02-23 01:30:00", "2022-02-23 03:00:00", "2022-02-23 02:40:00", "2022-02-23 03:00:00","2022-02-23 03:00:00", "2022-02-23 03:00:00", "2022-02-23 03:00:00"};
        for(int i = 0; i < 8; i++){
            Date startDate = sdf.parse(startDateStrs[i]);
            Date endDate = sdf.parse(endDateStrs[i]);
            pointFactory.push(new Date[]{startDate, endDate});
        }
        List<Point> pointList = pointFactory.createPointList();
        int ret = calcMaxOverlap(pointList);
        System.out.println(ret);
    }
}
