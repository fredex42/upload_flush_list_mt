import com.amazonaws.services.s3.model.{CompleteMultipartUploadResult, PutObjectResult}

object UploadResultType extends Enumeration {
  val Single, Multipart, AlreadyThere,DryRun = Value
}

case class UploadResult (uploadType: UploadResultType.Value, uploadedPath: String, singleResult: Option[PutObjectResult], mtResult: Option[CompleteMultipartUploadResult])
