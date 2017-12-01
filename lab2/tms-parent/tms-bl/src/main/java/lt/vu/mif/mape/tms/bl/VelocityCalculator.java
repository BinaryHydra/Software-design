package lt.vu.mif.mape.tms.bl;

import lt.vu.mif.mape.tms.model.task.Task;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface VelocityCalculator {

    BigDecimal calculate(List<Task> tasks, LocalDateTime startDate);
}
