package src.models;

public class PaymentResult {
    private final PaymentStatus status;
    private final String transactionId;
    private final String message;
    private final double amountPaid;

    public PaymentResult(PaymentStatus status, String transactionId, String message, double amountPaid) {
        this.status = status;
        this.transactionId = transactionId;
        this.message = message;
        this.amountPaid = amountPaid;
    }

    @Override
    public String toString() {
        return "PaymentResult{" +
                "status=" + status +
                ", transactionId='" + transactionId + '\'' +
                ", message='" + message + '\'' +
                ", amountPaid=" + amountPaid +
                '}';
    }
}
