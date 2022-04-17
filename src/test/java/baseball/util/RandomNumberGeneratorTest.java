package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class RandomNumberGeneratorTest {
    private static final int NUMBER_COUNT = 3;

    @Test
    @DisplayName("랜덤으로 생성된 숫자는 3자리이고, 중복되지 않으며 각 숫자는 1~9사이의 숫자이다")
    @RepeatedTest(1000)
    public void randomNumberTest() {
        List<Integer> numbers = RandomNumberGenerator.generateNumbers();

        assertThat(numbers).hasSize(NUMBER_COUNT)
                .doesNotHaveDuplicates()
                .filteredOn(number -> number >= 1 && number <= 9).size().isEqualTo(NUMBER_COUNT);
    }
}