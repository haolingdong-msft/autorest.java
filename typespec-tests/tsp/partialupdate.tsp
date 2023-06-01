import "@typespec/rest";
import "@azure-tools/typespec-azure-core";

using TypeSpec.Http;
using Azure.Core;

@service({
  title: "PartialUpdate",
  version: "1.0.0",
})
namespace Cadl.PartialUpdate;

model PartialUpdateModel {
  boolean: boolean;
  string: string;
  bytes: bytes;
}

#suppress "@azure-tools/typespec-azure-core/use-extensible-enum" "For testing"
@fixed
enum Color {
  Red,
  Blue,
  Green,
}

@route("/partialupdate")
interface PartialUpdateOp {
  read(@body color: Color): {
    @body body: PartialUpdateModel;
  };
}
