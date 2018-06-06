class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n/g
  val denom: Int = d/g

  def this(n: Int) = this(n, 1)

  override def toString = s"${numer}/${denom}"

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def +(i: Int) = new Rational(numer + i * denom, denom)

  def -(that: Rational) = new Rational(
    numer * that.denom - that.numer * denom,
    denom * that.denom
  )

  def -(i: Int) = new Rational(numer - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer , denom * that.denom)

  def *(i: Int) = new Rational (numer * i, denom)

  def /(that: Rational) = new Rational (
    numer * that.denom,
    denom * that.numer
  )

  def /(i: Int) = new Rational (numer, denom * i)

  def lessThan(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

}

val r1 = new Rational(1, 3)
val r2 = new Rational(1, 2)

r1 + r2
r2 * r1

r1 max r2

val r3 = new Rational(5)

new Rational(66, 42)

implicit def intToRational(i: Int) = new Rational(i)
2 * r1