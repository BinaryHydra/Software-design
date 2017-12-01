package lt.vu.mif.mape.tms.bl.impl;

import lt.vu.mif.mape.tms.bl.VelocityCalculator;
import lt.vu.mif.mape.tms.model.task.Task;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class PercentageVelocityCalculator implements VelocityCalculator{

    @Override
    public BigDecimal calculate(List<Task> tasks, LocalDateTime startDate) {
       Stream<Task> filteredTask = tasks.stream().filter(task -> task.getStartTime().isAfter(startDate));
       long total = filteredTask.count();
       long valid = filteredTask.filter(task -> task.getEndTime() != null).count();
       return new BigDecimal(valid).divide(BigDecimal.valueOf(total), BigDecimal.ROUND_HALF_UP);
    }
}
