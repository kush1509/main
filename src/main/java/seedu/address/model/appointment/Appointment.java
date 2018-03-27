package seedu.address.model.appointment;

import java.util.Objects;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

public class Appointment {

    private final Title title;
    private final StartDateTime startDateTime;
    private final EndDateTime endDateTime;

    /**
     * Every field must be present and not null.
     */
    public Appointment(Title title, StartDateTime startDateTime, EndDateTime endDateTime) {
        requireAllNonNull(title, startDateTime, endDateTime);
        this.title = title;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public Title getTitle() {
        return title;
    }

    public StartDateTime getStartDateTime() {
        return startDateTime;
    }

    public EndDateTime getEndDateTime() {
        return endDateTime;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Appointment)) {
            return false;
        }
        Appointment otherAppointment = (Appointment) other;
        return otherAppointment.getTitle().equals(this.getTitle())
                && otherAppointment.getStartDateTime().equals(this.getStartDateTime())
                && otherAppointment.getEndDateTime().equals(this.getEndDateTime());
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(title, startDateTime, endDateTime);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getTitle())
                .append(" Start Date Time: ")
                .append(getStartDateTime())
                .append(" End Date Time: ")
                .append(getEndDateTime());
        return builder.toString();
    }
}
