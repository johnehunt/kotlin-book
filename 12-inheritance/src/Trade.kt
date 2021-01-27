open class Trade(val tradeId: String,
                 open val stock: String = "IBM",
                 open var quantity: Int = 0)

open class EquityTrade(id: String,
                  override val stock: String = "MSoft",
                  qty: Int) : Trade(id, quantity = qty)

class ShortEquityTrade(id: String,
                       override val stock: String = "Short",
                       qty: Int) : EquityTrade(id, qty=qty)