package lt.vu.mif.mape.tms.bl.impl;

import lt.vu.mif.mape.tms.bl.VelocityCalculator;
import lt.vu.mif.mape.tms.model.task.Task;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class PointVelocityCalculator implements VelocityCalculator {

    public BigDecimal calculate(List<Task> tasks, LocalDateTime startDate) {
        Stream<Task> filteredTask = tasks.stream().filter(task -> task.getStartTime().isAfter(startDate));
        long total = filteredTask.map(Task::getPoints).mapToLong(Long::longValue).sum();
        long valid = filteredTask.filter(task -> task.getEndTime() != null).map(Task::getPoints).mapToLong(Long::longValue).sum();
        return new BigDecimal(valid).divide(BigDecimal.valueOf(total), BigDecimal.ROUND_HALF_UP);
    }
}
