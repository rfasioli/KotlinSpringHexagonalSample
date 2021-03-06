package br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain

import java.math.BigDecimal
import java.util.*

data class Loan(
    val id: UUID,
    val customer: Customer,
    val amount: BigDecimal,
    val installments: Int,
    val status: LoanStatus
) {
    companion object {
        fun build(
            loanRequest: LoanRequest,
            customer: Customer
        ): Loan =
            Loan(
                customer = customer,
                amount = loanRequest.amount,
                installments = loanRequest.installments,
                status = LoanStatus.PENDING,
                id = UUID.randomUUID()
            )
    }
}
