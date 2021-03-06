package misk.hibernate

import java.time.Instant
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Table

@Entity
@Table(name = "movies")
class DbMovie() : DbEntity<DbMovie>, DbTimestampedEntity {
  @javax.persistence.Id
  @GeneratedValue
  override lateinit var id: Id<DbMovie>

  @Column
  override lateinit var updated_at: Instant

  @Column
  override lateinit var created_at: Instant

  @Column(nullable = false)
  lateinit var name: String

  @Column(nullable = true)
  var release_date: LocalDate? = null

  constructor(name: String, releaseDate: LocalDate?) : this() {
    this.name = name
    this.release_date = releaseDate
  }
}